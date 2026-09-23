package com.masharipov2105.systems.model;

import java.util.ArrayList;

public class RequestModel{

	//fields
	private String projectName; //
	private String projectDescription; //
	private String projectFullDescription; //
	private ArrayList<String> projectFeatures; //
	private String projectGoal; //
	private ArrayList<ArrayList<String>> technologies; //
	private ArrayList<String> installWindowsCommands; //
	private ArrayList<String> installLinuxMacCommands; //
	private ArrayList<String> imagePaths; //
 	private String treeData; //
	private String litsenziya; //
	private String ownerGithubName; //
	private String ownerTelegramName; //
	private String ownerEmailName; //
	private String fileUrl;

	//constructor

	public RequestModel(
		String projectName, 
		String projectDescription, 
		String projectFullDescription,
		ArrayList<String> projectFeatures, 
		String projectGoal,
		ArrayList<ArrayList<String>> technologies,
		ArrayList<String> installWindowsCommands,
		ArrayList<String> installLinuxMacCommands,
		ArrayList<String> imagePaths,
		String treeData,
		String litsenziya,
		String ownerGithubName,
		String ownerTelegramName,
		String ownerEmailName,
		String fileUrl
	){
		//initialize
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.projectFullDescription = projectFullDescription;
		this.projectFeatures = projectFeatures;
		this.projectGoal = projectGoal;
		this.technologies = technologies;
		this.installWindowsCommands = installWindowsCommands;
		this.installLinuxMacCommands = installLinuxMacCommands;
		this.imagePaths = imagePaths;
		this.treeData = treeData;
		this.litsenziya = litsenziya;
		this.ownerGithubName = ownerGithubName;
		this.ownerTelegramName = ownerTelegramName;
		this.ownerEmailName = ownerEmailName;
		this.fileUrl = fileUrl;
	}

	// getters

	public String getProjectName(){

		return this.projectName;
	}

	public String getProjectDescription(){

		return this.projectDescription;
	}

	public String getProjectFullDescription(){

		return this.projectFullDescription;
	}

	public ArrayList<String> getProjectFeatures(){

		return this.projectFeatures;
	}

	public String getProjectGoal(){

		return this.projectGoal;
	}

	public ArrayList<ArrayList<String>> getTechnologies(){

		return this.technologies;
	}

	public ArrayList<String> getInstallWindowsCommands(){

		return this.installWindowsCommands;
	}

	public ArrayList<String> getInstallLinuxMacCommands(){

		return this.installLinuxMacCommands;
	}

	public ArrayList<String> getImagePaths(){

		return this.imagePaths;
	}

	public String getTreeData(){

		return this.treeData;
	}

	public String getLitsenziya(){

		return this.litsenziya;
	}

	public String getOwnerGithubName(){

		return this.ownerGithubName;
	}

	public String getOwnerTelegramName(){

		return this.ownerTelegramName;
	}

	public String getOwnerEmailName(){

		return this.ownerEmailName;
	}

	public String getFileUrl(){

		return this.fileUrl;
	}


	//setters

	public void setProjectName(String newProjectName){

		this.projectName = newProjectName;
	}

	public void setProjectDescription(String newProjectDescription){

		this.projectDescription = newProjectDescription;
	}

	public void setProjectFullDescription(String newProjectFullDescription){

		this.projectFullDescription = newProjectFullDescription;
	}

	public void setProjectFeatures(ArrayList<String> newProjectFeature){

		this.projectFeatures = newProjectFeature;
	}

	public void setProjectGoal(String newProjectGoal){

		this.projectGoal = newProjectGoal;
	}

	public void setTechnologies(ArrayList<ArrayList<String>> newTechnologies){

		this.technologies = newTechnologies;
	}

	public void setInstallWindowsCommands(ArrayList<String> newInstallWindowsCommand){

		this.installWindowsCommands = newInstallWindowsCommand;
	}

	public void setInstallLinuxMacCommands(ArrayList<String> newInstallLinuxMacCommands){

		this.installLinuxMacCommands = newInstallLinuxMacCommands;
	}

	public void setImagePaths(ArrayList<String> newImagePaths){

		this.imagePaths = newImagePaths;
	}

	public void setTreeData(String newTreeData){

		this.treeData = newTreeData;
	}

	public void setLitsenziya(String newLitsenziya){

		this.litsenziya = newLitsenziya;
	}

	public void setOwnerGithubName(String newOwnerGithubName){

		this.ownerGithubName = newOwnerGithubName;
	}

	public void setOwnerTelegramName(String newOwnerTelegramName){

		this.ownerTelegramName = newOwnerTelegramName;
	}

	public void setOwnerEmailName(String newOwnerEmailName){

		this.ownerEmailName = newOwnerEmailName;
	}

	public void setFileUrl(String newFileUrl){

		this.fileUrl = newFileUrl;
	}
}