package com.masharipov2105.systems.controller;

import com.masharipov2105.systems.model.RequestModel;
import com.masharipov2105.systems.utils.InputValidator;
import com.masharipov2105.systems.utils.TreeGenerator;
import com.masharipov2105.systems.service.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadmeController{

	private ReadmeService service;
	private Scanner scanner;
	private boolean isRun = true;

	private String banner = "===================================================\n" +
							"==             Console Readme Generator          ==\n" +
							"===================================================\n";

	private String help = "1. help - show program commands\n" +
						  "2. done - closed progress\n" +
						  "3. quit - closed progress and exit program\n";


	public ReadmeController(ReadmeService service){

		this.service = service;
		this.scanner = new Scanner(System.in);
	}

	public void start(){

		System.out.println(banner);
		System.out.println(help);

		String projectName = getProjectName();
		String projectDescription = getProjectDescription(projectName);
		String projectFullDescription = getProjectFullDescription();
		ArrayList<String> projectFeatures = getProjectFeatures();
		String projectGoalFormat = getProjectGoalFormat();
		ArrayList<ArrayList<String>> projectTechnologies = getTechnologies();
		ArrayList<String> installWindowsCommands = getInstallWindowsCommands();
		ArrayList<String> installLinuxMacCommands = getInstallLinuxMacCommands();
		ArrayList<String> imagePaths = getImagePaths();
		String treeData = getTreeData();
		String litsenziya = getIitsenziya();
		String ownerGithubName = getOwnerGithubName();
		String ownerTelegramName = getOwnerTelegramName();
		String ownerGmailName = getOwnerEmailName();
		String fileUrl = getFileUrl();

		RequestModel requestModel = new RequestModel(

			projectName,
			projectDescription,
			projectFullDescription,
			projectFeatures,
			projectGoalFormat,
			projectTechnologies,
			installWindowsCommands,
			installLinuxMacCommands,
			imagePaths,
			treeData,
			litsenziya,
			ownerGithubName,
			ownerTelegramName,
			ownerGmailName,
			fileUrl
		);

		boolean result = service.uploadProjectData(requestModel);

		if (result){

			System.out.println("readme.md successefuly created");
		} else{

			System.out.println("Error not createp readme,md");
		}
	}

	public String getProjectName(){

		System.out.print("enter project name: ");
		String data = this.scanner.nextLine();

		String result = InputValidator.parseProjectName(data);

		if (result == null){

			System.out.println("The name must not be empty!");
			getProjectName();
		}

		return result;
	}

	public String getProjectDescription(String projectName){

		System.out.print("Enter a brief description of the project: ");
		String data = this.scanner.nextLine();

		String result = InputValidator.parseProjectDescription(data);

		if (result == null){

			System.out.println("The project description cannot be empty.");
			getProjectDescription(projectName);
		}

		return (projectName + "%%" + result);
	}


	public String getProjectFullDescription(){

		boolean run1 = true;
		boolean run2 = true;

		String general = "";
		String finalResult = "";

		String format = "Initial general text\n" +
						"About feature 1\n" +
						"About feature 2\n" +
						"About feature 3\n" +
						"...\n";
		
		System.out.println("The full description text of the project will appear as follows:\n");
		System.out.println(format);

		while (run1){

			System.out.print("enter general text: ");
			general = this.scanner.nextLine();

			if (general == null || general.trim().isEmpty()){

				continue;
			}

			run1 = false;
		}

		finalResult += general;

		int index = 1;

		while (run2){

			System.out.print(String.format("enter about feature %d: ", index));
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				continue;				
			} else{

				if (data.equals("done")){

					run2 = false;
					break;
				}

				finalResult += "%%" + data;
				index ++;
			}

		}

		return finalResult;
	}


	public ArrayList<String> getProjectFeatures(){

		boolean run = true;
		int index = 1;

		ArrayList<String> result = new ArrayList<>();

		System.out.println("Format- function : description  (e.g. Search books : Finds books)");
		System.out.println("'done' command to finish.\n");


		while (run){

			System.out.print(String.format("enter line %s: ", index));
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				continue;
			} else{

				if (data.equals("done")){

					run = false;
					break;
				} else{

					String[] res = data.split(":");

					if (res.length != 2){

						System.out.println("Format- function : description  (e.g. Search books : Finds books)");
						continue;
					} else{

						result.add(res[0] + "%%"+ res[1]);
						index ++;
					}
				}
			}
		}

		return result;
	}

	public String getProjectGoalFormat(){

		boolean run1 = true;
		boolean run2 = true;

		int index = 1;

		String general = "";

		String finalResult = "";

		String format = "General text\n" +
						"Goal 1\n" +
						"Goal 2\n" +
						"Goal 3\n" +
						"...\n";

		System.out.println("The project objective should be entered in the following order:\n");
		System.out.println(format);

		while (run1){

			System.out.print("enter general text: ");
			general = this.scanner.nextLine();

			if (general == null || general.trim().isEmpty()){

				System.out.println("The general text cannot be empty.");
				continue;
			} else{

				finalResult += general;
				run1 = false;
				break;
			}
		}

		while(run2){

			System.out.print(String.format("enter line %d: ", index));
			String lines = this.scanner.nextLine();

			if (lines == null || lines.trim().isEmpty()){

				continue;
			} else{

				if (lines.equals("done")){

					run2 = false;
					break;
				} else{

					finalResult += "%%" + lines;
					index ++;
				}
			}
		}

		return finalResult;
	}

	public ArrayList<ArrayList<String>> getTechnologies(){

		int index = 1;
		boolean run = true;

		ArrayList<ArrayList<String>> result = new ArrayList<>();

		String example = "Technology : Version : Objective (e.g. JUnit : 5.10.1 : code testing)";

		System.out.println("\nThe list of technologies is entered in the following order:");
		System.out.println(String.format("\n%s\n", example));

		while(run){

			System.out.print(String.format("enter line %d: ", index));
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				continue;
			} else{

				if (data.equals("done")){

					run = false;
					break;
				} else {
					
					if (data.split(":").length != 3){

						System.out.println("Technology : Version : Objective (e.g. JUnit : 5.10.1 : code testing)");
						continue;
					} else{

						String[] d = data.split(":");
						ArrayList<String> helper = new ArrayList<>();
						helper.add(d[0]);
						helper.add(d[1]);
						helper.add(d[2]);
						result.add(helper);
						index ++;
					}	
				}
			}
		}

		return result;
	}

	public ArrayList<String> getInstallWindowsCommands(){

		ArrayList<String> result = new ArrayList<>();

		int index = 1;
		boolean run = true;

		String example = "git clone https://github/repo\n" +
						 "cd repo\n" +
						 "mvn clean package\n" +
						 "...\n";
		System.out.println("\nEnter the installation and startup commands for the Windows system in the correct order. For example:\n");
		System.out.println(example);

		while(run){

			System.out.print(String.format("enter command %d: ", index));
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				continue;
			} else{

				if (data.equals("done")){

					run = false;
					break;
				} else{

					result.add(data);
					index ++;
				}
			}
		}
		return result;
	}


	public ArrayList<String> getInstallLinuxMacCommands(){

		ArrayList<String> result = new ArrayList<>();

		int index = 1;
		boolean run = true;

		String example = "git clone https://github/repo\n" +
						 "cd repo\n" +
						 "mvn clean package\n" +
						 "...\n";
		System.out.println("\nEnter the installation and startup commands for the Linux and Mac system in the correct order. For example:\n");
		System.out.println(example);

		while(run){

			System.out.print(String.format("enter command %d: ", index));
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				continue;
			} else{

				if (data.equals("done")){

					run = false;
					break;
				} else{

					result.add(data);
					index ++;
				}
			}
		}
		return result;
	}

	public ArrayList<String> getImagePaths(){

		ArrayList<String> result = new ArrayList<>();

		int index = 1;

		boolean run = true;

		System.out.println("\nEnter the web link to the screenshots taken when the project was launched.\n");

		while(run){

			System.out.print(String.format("enter link %d: ", index));
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				continue;
			} else{

				if (data.equals("done")){

					run = false;
					break;
				} else{

					result.add(data);
					index ++;
				}
			}
		}

		return result;
	}

	public String getTreeData(){

		boolean run = true;

		String result = "";

		while (run){

			System.out.print("enter project folder path: ");
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				System.out.println("The path cannot be empty.");
				continue;

			} else{

				result = TreeGenerator.generate(data, false, 0);

				if (result.equals("invalid path: path is null")){

					System.out.println(result);
					continue;
				} else if (result.equals("Invalid path: path is not exists")){

					System.out.println(result);
					continue;
				}else if (result.equals("Invalid path: is not folder")){

					System.out.println(result);
					continue;
				}else if (result.equals("invalid file: file is null")){

					System.out.println(result);
					continue;
				} else if(data.equals("done")){

					System.out.println("The path cannot be empty");
					continue;
				} else{

					run = false;
					break;
				}
			}
		}

		return result;
	}

	public String getIitsenziya(){

		String result = "";

		boolean run = true;

		while(run){

			System.out.print("Enter the text regarding the project license: ");
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				System.out.println("The license text cannot be empty.");
				continue;
			} else{

				if (data.equals("done")){

					System.out.println("The license text cannot be empty.");
					continue;
				} else{

					result = data;
					run = false;
					break;
				}
			}
		}

		return result;
	}

	public String getOwnerGithubName(){

		String result = "";

		boolean run = true;

		while(run){

			System.out.print("enter owner github username: ");
			String data = this.scanner.nextLine();

			if (InputValidator.parseOwnerGithubName(data) == null){

				System.out.println("GitHub username cannot be empty.");
				continue;
			} else{

				if (data.equals("done")){

					System.out.println("GitHub username cannot be empty.");
					continue;
				} else{

					result = data;
					run = false;
					break;
				}
			}
		}

		return result;
	}

	public String getOwnerTelegramName(){

		String result = "";

		boolean run = true;

		while(run){

			System.out.print("enter owner telegram username: ");
			String data = this.scanner.nextLine();

			String validator = InputValidator.parseOwnerTelegramName(data);

			if (validator == null){

				System.out.println("Telegram username cannot be empty.");
				continue;
			} else if (validator.equals("Invalid data: Telegram username")){

				System.out.println("The Telegram username must start with @.");
				continue;
			} else{

				result = data;
				run = false;
				break;
			}
		}

		return result;
	}

	public String getOwnerEmailName(){

		String result = "";

		boolean run = true;

		while(run){

			System.out.print("enter owner gmail: ");
			String data = this.scanner.nextLine();

			String validator = InputValidator.parseOwnerEmailName(data);

			if (validator == null){

				System.out.println("Gmail cannot be empty.");
				continue;
			} else if (validator.equals("invalid data: Email account")){

				System.out.println("The gmail format is incorrect. e.g gmaliname@gmail.com");
				continue;
			} else if (validator.equals("invalid data: Invalid Gmail")){

				System.out.println("Invalid gmail; it must end with @gmail.com.");
				continue;
			} else {
				
				result = data;
				run = false;
				break;
			}
		}

		return result;
	}

	public String getFileUrl(){

		String result = "";

		boolean run = true;

		while(run){

			System.out.print("Specify the path for generating the readme.md file. ");
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				System.out.println("The path cannot be empty.");
				continue;
			} else{

				if (data.equals("done")){

					System.out.println("The path cannot be empty.");
					continue;
				} else{

					result = data;
					run = false;
					break;
				}
			}
		}

		return result;
	}
}