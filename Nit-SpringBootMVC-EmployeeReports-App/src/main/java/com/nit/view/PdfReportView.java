package com.nit.view;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.nit.model.Employee;



/*
@Component("pdf_report")
public class PdfReportView extends AbstractPdfView {
	
	

		@Override
		public void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer,
				HttpServletRequest req, HttpServletResponse res) throws Exception {
			//get Model attributes data
			List<Employee> list = (List<Employee>) map.get("empsList");
			
			doc.open();
			Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
			font.setSize(18);
			font.setColor(Color.BLUE);
			
			//Add paragraph
			Paragraph para1 = new Paragraph("DIVATT EMPLOYEE Application", new Font(Font.TIMES_ROMAN, Font.DEFAULTSIZE, Font.BOLDITALIC));
			para1.setAlignment(Paragraph.ALIGN_CENTER);
			doc.add(para1);
	
			Paragraph para = new Paragraph(" Divatt Employee Report", new Font(Font.TIMES_ROMAN, Font.DEFAULTSIZE, Font.BOLDITALIC));
			para.setAlignment(Paragraph.ALIGN_CENTER);
			doc.add(para);
			//Add table content
	
	
		
			
			Table table = new Table(5,((ArrayList)list).size());
			for(Employee emp:list) {
				table.addCell(String.valueOf(emp.getEmpno()));
				table.addCell(emp.getEname());
				table.addCell(emp.getJob());
				table.addCell(String.valueOf(emp.getSal()));
				table.addCell(String.valueOf(emp.getDeptno()));
	
			}
			doc.add(table);
		}//method
	*/
