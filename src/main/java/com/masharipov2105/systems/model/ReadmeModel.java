package com.masharipov2105.systems.model;

import java.util.ArrayList;

public class ReadmeModel{

	//fields
	private String finalProjectName;
	private String finalProjectDescription;
	private String finalProjectFullDescription;
	private String finalProjectFeatures;
	private String finalProjectGoal;
	private String finalTechnologies;
	private String finalInstallWindowsCommands;
	private String finalInstallLinuxMacCommands;
	private String finalImagePaths;
 	private String finalTreeData;
	private String finalLitsenziya;
	private String ownerData;
	private String finalFileUrl;

	//constructor

	public ReadmeModel(
		String projectName, 
		String projectDescription, 
		String finalProjectFullDescription,
		String projectFeatures, 
		String projectGoal,
		String technologies,
		String installWindowsCommands,
		String installLinuxMacCommands,
		String imagePaths,
		String treeData,
		String litsenziya,
		String ownerData,
		String finalFileUrl
	){
		//initialize
		this.finalProjectName = projectName;
		this.finalProjectDescription = projectDescription;
		this.finalProjectFullDescription = finalProjectFullDescription;
		this.finalProjectFeatures = projectFeatures;
		this.finalProjectGoal = projectGoal;
		this.finalTechnologies = technologies;
		this.finalInstallWindowsCommands = installWindowsCommands;
		this.finalInstallLinuxMacCommands = installLinuxMacCommands;
		this.finalImagePaths = imagePaths;
		this.finalTreeData = treeData;
		this.finalLitsenziya = litsenziya;
		this.ownerData = ownerData;
		this.finalFileUrl = finalFileUrl;
	}

	// getters

	public String getFinalProjectName(){

		return this.finalProjectName;
	}

	public String getFinalProjectDescription(){

		return this.finalProjectDescription;
	}

	public String getFinalProjectFullDescription(){

		return this.finalProjectFullDescription;
	}

	public String getFinalProjectFeatures(){

		return this.finalProjectFeatures;
	}

	public String getFinalProjectGoal(){

		return this.finalProjectGoal;
	}

	public String getFinalTechnologies(){

		return this.finalTechnologies;
	}

	public String getFinalInstallWindowsCommands(){

		return this.finalInstallWindowsCommands;
	}

	public String getFinalInstallLinuxMacCommands(){

		return this.finalInstallLinuxMacCommands;
	}

	public String getFinalImagePaths(){

		return this.finalImagePaths;
	}

	public String getFinalTreeData(){

		return this.finalTreeData;
	}

	public String getFinalLitsenziya(){

		return this.finalLitsenziya;
	}

	public String getOwnerData(){

		return this.ownerData;
	}

	public String getFinalFileUrl(){

		return this.finalFileUrl;
	}


	//setters

	public void setFinalProjectName(String newProjectName){

		this.finalProjectName = newProjectName;
	}

	public void setFinalProjectDescription(String newProjectDescription){

		this.finalProjectDescription = newProjectDescription;
	}

	public void setFinalProjectFullDescription(String newProjectFullDescription){

		this.finalProjectFullDescription = newProjectFullDescription;
	}

	public void setFinalProjectFeatures(String newProjectFeature){

		this.finalProjectFeatures = newProjectFeature;
	}

	public void setFinalProjectGoal(String newProjectGoal){

		this.finalProjectGoal = newProjectGoal;
	}

	public void setFinalTechnologies(String newTechnologies){

		this.finalTechnologies = newTechnologies;
	}

	public void setFinalInstallWindowsCommands(String newInstallWindowsCommand){

		this.finalInstallWindowsCommands = newInstallWindowsCommand;
	}

	public void setFinalInstallLinuxMacCommands(String newInstallLinuxMacCommands){

		this.finalInstallLinuxMacCommands = newInstallLinuxMacCommands;
	}

	public void setFinalImagePaths(String newImagePaths){

		this.finalImagePaths = newImagePaths;
	}

	public void setFinalTreeData(String newTreeData){

		this.finalTreeData = newTreeData;
	}

	public void setFinalLitsenziya(String newLitsenziya){

		this.finalLitsenziya = newLitsenziya;
	}

	public void setOwnerData(String newOwnerData){

		this.ownerData = newOwnerData;
	}

	public void setFinalFileUrl(String newFinalFileUrl){

		this.finalFileUrl = newFinalFileUrl;
	}
}