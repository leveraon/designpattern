package com.leveraon.designpattern.behavioral.iterator;

import com.leveraon.designpattern.behavioral.command.Command;
import com.leveraon.designpattern.behavioral.command.FileSystemReceiver;

public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;

	public CloseFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	public void execute() {
		this.fileSystem.closeFile();
	}
}
