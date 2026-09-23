package com.masharipov2105.systems.service;

import com.masharipov2105.systems.model.*;
import com.masharipov2105.systems.utils.MarkdownTransmitter;
import com.masharipov2105.systems.utils.TreeGenerator;
import com.masharipov2105.systems.generator.*;

import java.util.ArrayList;

public class ReadmeServiceImpl implements ReadmeService{


	// empty constructor
   	public ReadmeServiceImpl(){}

   	@Override
   	public boolean uploadProjectData(RequestModel model){

   		String[] ownerData = {model.getOwnerGithubName(), model.getOwnerTelegramName(), model.getOwnerEmailName()};
   		
   		ReadmeModel readmeModel = new ReadmeModel(

   			MarkdownTransmitter.projectNameFormat(model.getProjectName()),
   			MarkdownTransmitter.projectDescriptionFormat(model.getProjectDescription()),
   			MarkdownTransmitter.projectFullDescriptionFormat(model.getProjectFullDescription()),
   			MarkdownTransmitter.projectFeaturesFormat(model.getProjectFeatures()),
   			MarkdownTransmitter.projectGoalFormat(model.getProjectGoal()),
   			MarkdownTransmitter.technologiesFormat(model.getTechnologies()),
   			MarkdownTransmitter.installWindowsCommandsFormat(model.getInstallWindowsCommands()),
   			MarkdownTransmitter.installLinuxMacCommandsFormat(model.getInstallLinuxMacCommands()),
   			MarkdownTransmitter.imagePathsFormat(model.getImagePaths()),
   			MarkdownTransmitter.treeDataFormat(model.getTreeData()),
   			MarkdownTransmitter.litsenziyaFormat(model.getLitsenziya()),
   			MarkdownTransmitter.ownerFormat(ownerData),
   			model.getFileUrl()
   		);
   		
   		return true;
   	} 
}