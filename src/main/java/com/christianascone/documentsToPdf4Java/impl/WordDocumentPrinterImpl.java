package com.christianascone.documentsToPdf4Java.impl;

import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import com.christianascone.documentsToPdf4Java.interfaces.DocumentPrinter;

public class WordDocumentPrinterImpl implements DocumentPrinter {
	public void printPdf(InputStream in, OutputStream out) throws Exception {
		XWPFDocument document = new XWPFDocument(in);
		PdfOptions options = null;
		PdfConverter.getInstance().convert(document, out, options);
	}

}