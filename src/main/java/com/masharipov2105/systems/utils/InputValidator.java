package com.masharipov2105.systems.utils;

import java.util.ArrayList;

public final class InputValidator{

	//constructor
	private InputValidator(){

		throw new UnsupportedOperationException("Utility class cannot be instantiated!");		          
	}

	//static methods

	public static String parseProjectName(String data){

		if (data == null || data.trim().isEmpty()){

			return null;
		}
		
		return data;
	}

	public static String parseProjectDescription(String data){

		if (data == null || data.trim().isEmpty()){

			return null;
		}

		return data;
	}

	public static ArrayList<String> parseProjectFeatures(ArrayList<String> data){

		if (data == null || data.size() == 0){

			return null;
		}

		return data;
	}

	public static String parseProjectGoal(String data){

		if (data == null || data.trim().isEmpty()){

			return null;
		}

		return data;
	}

	public static ArrayList<ArrayList<String>> parseTechnologies(ArrayList<ArrayList<String>> data){

		if (data == null || data.size() == 0){

			return null;
		}

		return data;
	}

	public static ArrayList<String> parseInstallWindowsCommands(ArrayList<String> data){

		if (data == null || data.size() == 0){

			return null;
		}

		return data;
	}

	public static ArrayList<String> parseInstallLinuxMacCommands(ArrayList<String> data){

		if (data == null || data.size() == 0){

			return null;
		}

		return data;
	}

	public static ArrayList<String> parseImagePaths(ArrayList<String> data){

		if (data == null || data.size() == 0){

			return null;
		}

		return data;
	}

	public static String parseTreeData(String data){

		if (data == null || data.trim().isEmpty()){

			return null;
		}

		return data;
	}

	public static String parseIitsenziya(String data){

		if (data == null || data.trim().isEmpty()){

			return null;
		}

		return data;
	}

	public static String parseOwnerGithubName(String data){

		if (data == null || data.trim().isEmpty()){

			return null;
		}

		return data;
	}

	public static String parseOwnerTelegramName(String data){

		if (data == null || data.trim().isEmpty()){

			return null;
		}

		if (data.charAt(0) != '@'){

			return "Invalid data: Telegram username";
		}

		return data;
	}

	public static String parseOwnerEmailName(String data){

		if (data == null || data.trim().isEmpty()){

			return null;
		}

		if (data.length() < 11){

			return "invalid data: Email account";
		}

		String helper = "";
        int ds = data.length();
        for (int i = (ds - 1); i >= (ds-10); i --){

            helper += data.charAt(i);
        }
        String finalHelper = "";

        int hs = helper.length();

        for (int i = (hs - 1); i >= 0; i --){

            finalHelper += helper.charAt(i);
        }


		if (!finalHelper.equals("@gmail.com")){

			return "invalid data: Invalid Gmail";
		}

		return data;
	}
}