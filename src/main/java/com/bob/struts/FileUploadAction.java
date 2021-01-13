package com.bob.struts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Action("/fileupload")
@Results({ @Result(name = "success", location = "/uploaded.jsp"), @Result(name = "input", location = "/index.jsp") })
public class FileUploadAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private File fileUpload;
	private String fileUploadFileName;
	private String localDirectory ="C:\\Temp";
	

	
	public File getFileUpload() {
		return fileUpload;
	}



	public String getFileUploadFileName() {
		return fileUploadFileName;
	}



	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}



	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}



	public String execute() throws Exception {
		File whereToStore = new File(localDirectory,fileUploadFileName);
		FileUtils.copyFile(fileUpload, whereToStore);
		return SUCCESS;
	}
}
