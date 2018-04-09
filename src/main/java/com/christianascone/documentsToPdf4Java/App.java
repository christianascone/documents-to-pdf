package com.christianascone.documentsToPdf4Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.christianascone.documentsToPdf4Java.impl.WordDocumentPrinterImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException,
			Exception {
		if(args.length != 3){
			System.out.println("Missing parameters");
			// TODO
			System.out.println("Usage: Pass 3 parameters");
			System.out.println("\t Input file path");
			System.out.println("\t Output file path");
			System.out.println("\t Document type (e.g. Word)");
			return;
		}
		String filepath = args[0];
		String outpath = args[1];
		String documentType = args[2];
		if(documentType.equals("Word"))
			new WordDocumentPrinterImpl().printPdf(new FileInputStream(new File(
				filepath)), new FileOutputStream(new File(outpath)));
	}
}
