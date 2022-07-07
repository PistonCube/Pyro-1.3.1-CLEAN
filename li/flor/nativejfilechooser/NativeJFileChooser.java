// 
// Decompiled by Procyon v0.5.36
// 

package li.flor.nativejfilechooser;

import javafx.embed.swing.JFXPanel;
import java.util.Iterator;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileFilter;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.HeadlessException;
import javafx.application.Platform;
import javafx.stage.Window;
import java.util.concurrent.CountDownLatch;
import java.awt.Component;
import javax.swing.filechooser.FileSystemView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;

public class NativeJFileChooser extends JFileChooser
{
    public static final boolean FX_AVAILABLE;
    private List<File> currentFiles;
    private FileChooser fileChooser;
    private File currentFile;
    private DirectoryChooser directoryChooser;
    
    public NativeJFileChooser() {
        this.initFxFileChooser(null);
    }
    
    public NativeJFileChooser(final String currentDirectoryPath) {
        super(currentDirectoryPath);
        this.initFxFileChooser(new File(currentDirectoryPath));
    }
    
    public NativeJFileChooser(final File currentDirectory) {
        super(currentDirectory);
        this.initFxFileChooser(currentDirectory);
    }
    
    public NativeJFileChooser(final FileSystemView fsv) {
        super(fsv);
        this.initFxFileChooser(fsv.getDefaultDirectory());
    }
    
    public NativeJFileChooser(final File currentDirectory, final FileSystemView fsv) {
        super(currentDirectory, fsv);
        this.initFxFileChooser(currentDirectory);
    }
    
    public NativeJFileChooser(final String currentDirectoryPath, final FileSystemView fsv) {
        super(currentDirectoryPath, fsv);
        this.initFxFileChooser(new File(currentDirectoryPath));
    }
    
    @Override
    public int showOpenDialog(final Component parent) throws HeadlessException {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            return super.showOpenDialog(parent);
        }
        final CountDownLatch latch = new CountDownLatch(1);
        Platform.runLater((Runnable)new Runnable() {
            @Override
            public void run() {
                if (parent != null) {
                    parent.setEnabled(false);
                }
                if (NativeJFileChooser.this.isDirectorySelectionEnabled()) {
                    NativeJFileChooser.this.currentFile = NativeJFileChooser.this.directoryChooser.showDialog((Window)null);
                }
                else if (NativeJFileChooser.this.isMultiSelectionEnabled()) {
                    NativeJFileChooser.this.currentFiles = (List<File>)NativeJFileChooser.this.fileChooser.showOpenMultipleDialog((Window)null);
                }
                else {
                    NativeJFileChooser.this.currentFile = NativeJFileChooser.this.fileChooser.showOpenDialog((Window)null);
                }
                latch.countDown();
            }
        });
        try {
            latch.await();
        }
        catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        finally {
            if (parent != null) {
                parent.setEnabled(true);
            }
        }
        if (this.isMultiSelectionEnabled()) {
            if (this.currentFiles != null) {
                return 0;
            }
            return 1;
        }
        else {
            if (this.currentFile != null) {
                return 0;
            }
            return 1;
        }
    }
    
    @Override
    public int showSaveDialog(final Component parent) throws HeadlessException {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            return super.showSaveDialog(parent);
        }
        final CountDownLatch latch = new CountDownLatch(1);
        Platform.runLater((Runnable)new Runnable() {
            @Override
            public void run() {
                if (parent != null) {
                    parent.setEnabled(false);
                }
                if (NativeJFileChooser.this.isDirectorySelectionEnabled()) {
                    NativeJFileChooser.this.currentFile = NativeJFileChooser.this.directoryChooser.showDialog((Window)null);
                }
                else {
                    NativeJFileChooser.this.currentFile = NativeJFileChooser.this.fileChooser.showSaveDialog((Window)null);
                }
                latch.countDown();
            }
        });
        try {
            latch.await();
        }
        catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        finally {
            if (parent != null) {
                parent.setEnabled(true);
            }
        }
        if (this.currentFile != null) {
            return 0;
        }
        return 1;
    }
    
    @Override
    public int showDialog(final Component parent, final String approveButtonText) {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            return super.showDialog(parent, approveButtonText);
        }
        return this.showOpenDialog(parent);
    }
    
    @Override
    public File[] getSelectedFiles() {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            return super.getSelectedFiles();
        }
        if (this.currentFiles == null) {
            return null;
        }
        return this.currentFiles.toArray(new File[this.currentFiles.size()]);
    }
    
    @Override
    public File getSelectedFile() {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            return super.getSelectedFile();
        }
        return this.currentFile;
    }
    
    @Override
    public void setSelectedFiles(final File[] selectedFiles) {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            super.setSelectedFiles(selectedFiles);
            return;
        }
        if (selectedFiles == null || selectedFiles.length == 0) {
            this.currentFiles = null;
        }
        else {
            this.setSelectedFile(selectedFiles[0]);
            this.currentFiles = new ArrayList<File>(Arrays.asList(selectedFiles));
        }
    }
    
    @Override
    public void setSelectedFile(final File file) {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            super.setSelectedFile(file);
            return;
        }
        if ((this.currentFile = file) != null) {
            if (file.isDirectory()) {
                this.fileChooser.setInitialDirectory(file.getAbsoluteFile());
                if (this.directoryChooser != null) {
                    this.directoryChooser.setInitialDirectory(file.getAbsoluteFile());
                }
            }
            else if (file.isFile()) {
                this.fileChooser.setInitialDirectory(file.getParentFile());
                this.fileChooser.setInitialFileName(file.getName());
                if (this.directoryChooser != null) {
                    this.directoryChooser.setInitialDirectory(file.getParentFile());
                }
            }
        }
    }
    
    @Override
    public void setFileSelectionMode(final int mode) {
        super.setFileSelectionMode(mode);
        if (!NativeJFileChooser.FX_AVAILABLE) {
            return;
        }
        if (mode == 1) {
            if (this.directoryChooser == null) {
                this.directoryChooser = new DirectoryChooser();
            }
            this.setSelectedFile(this.currentFile);
            this.setDialogTitle(this.getDialogTitle());
        }
    }
    
    @Override
    public void setDialogTitle(final String dialogTitle) {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            super.setDialogTitle(dialogTitle);
            return;
        }
        this.fileChooser.setTitle(dialogTitle);
        if (this.directoryChooser != null) {
            this.directoryChooser.setTitle(dialogTitle);
        }
    }
    
    @Override
    public String getDialogTitle() {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            return super.getDialogTitle();
        }
        return this.fileChooser.getTitle();
    }
    
    @Override
    public void changeToParentDirectory() {
        if (!NativeJFileChooser.FX_AVAILABLE) {
            super.changeToParentDirectory();
            return;
        }
        final File parentDir = this.fileChooser.getInitialDirectory().getParentFile();
        if (parentDir.isDirectory()) {
            this.fileChooser.setInitialDirectory(parentDir);
            if (this.directoryChooser != null) {
                this.directoryChooser.setInitialDirectory(parentDir);
            }
        }
    }
    
    @Override
    public void addChoosableFileFilter(final FileFilter filter) {
        super.addChoosableFileFilter(filter);
        if (!NativeJFileChooser.FX_AVAILABLE || filter == null) {
            return;
        }
        if (filter.getClass().equals(FileNameExtensionFilter.class)) {
            final FileNameExtensionFilter f = (FileNameExtensionFilter)filter;
            final List<String> ext = new ArrayList<String>();
            for (final String extension : f.getExtensions()) {
                ext.add(extension.replaceAll("^\\*?\\.?(.*)$", "*.$1"));
            }
            this.fileChooser.getExtensionFilters().add((Object)new FileChooser.ExtensionFilter(f.getDescription(), (List)ext));
        }
    }
    
    @Override
    public void setAcceptAllFileFilterUsed(final boolean bool) {
        final boolean differs = this.isAcceptAllFileFilterUsed() ^ bool;
        super.setAcceptAllFileFilterUsed(bool);
        if (!NativeJFileChooser.FX_AVAILABLE) {
            return;
        }
        if (!differs) {
            return;
        }
        if (bool) {
            this.fileChooser.getExtensionFilters().add((Object)new FileChooser.ExtensionFilter("All files", new String[] { "*.*" }));
        }
        else {
            final Iterator<FileChooser.ExtensionFilter> it = (Iterator<FileChooser.ExtensionFilter>)this.fileChooser.getExtensionFilters().iterator();
            while (it.hasNext()) {
                final FileChooser.ExtensionFilter filter = it.next();
                if (filter.getExtensions().size() == 1 && filter.getExtensions().contains("*.*")) {
                    it.remove();
                }
            }
        }
    }
    
    private void initFxFileChooser(final File currentFile) {
        if (NativeJFileChooser.FX_AVAILABLE) {
            this.fileChooser = new FileChooser();
            this.setSelectedFile(this.currentFile = currentFile);
        }
    }
    
    static {
        boolean isFx;
        try {
            Class.forName("javafx.stage.FileChooser");
            isFx = true;
            final JFXPanel jfxPanel = new JFXPanel();
        }
        catch (ClassNotFoundException e) {
            isFx = false;
        }
        FX_AVAILABLE = isFx;
    }
}
