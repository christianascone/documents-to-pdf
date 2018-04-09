package com.christianascone.documentsToPdf4Java.interfaces;

import java.io.InputStream;
import java.io.OutputStream;

public interface DocumentPrinter {
	/**
	 * Reading the input stream, it is converted to PDF and streamed in given output stream
	 * 
	 * @param in Input stream
	 * @param out Final output stream
	 * @throws Exception
	 */
	void printPdf(InputStream in, OutputStream out) throws Exception;
}
