package com.leveraon.designpattern.behavioral.command;

public class FileSystemClient {
	public static void main(String[] args) {
		// Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil
				.getUnderlyingFileSystem();

		// creating command and associating with receiver
		Command openFileCommand = new OpenFileCommand(fs);

		// Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);

		// perform action on invoker object
		file.execute();

		Command writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();

		Command closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
	}
}
