package com.java.ThumbnailCreator.main;

import javax.swing.JOptionPane;

import com.java.ThumbnailCreater.classes.ImageConverter;

public class ConversionThread extends Thread {

	ImageConverter imageConverter;

	public ConversionThread(ImageConverter imageConverter) {
		this.imageConverter = imageConverter;
	}

	public void run() {
		String result = imageConverter.convertImages();
		JOptionPane.showMessageDialog(null, result);
		// Thread sleeps for 4 milis.
		try {
			Thread.sleep(4);
		} catch (InterruptedException e) {
			return;
		}
	}
ĺ
