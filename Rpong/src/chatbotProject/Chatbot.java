package chatbotProject;

public class Chatbot {
	
	private String userName;
	private Topic ricky;
	private boolean chatting;
	
	public Chatbot() {
		ricky = new ChatbotRicky();
		userName = "unknown user";
		chatting = true;
	}

	public void startTalking() {
		ChatbotMain.print("Welcome to our chatbot! What is your name?");
		userName = ChatbotMain.getInput();
		chatting = true;
		while(chatting) {
			ChatbotMain.print("What do you want to talk about?");
			String response = ChatbotMain.getInput();
			if(ricky.isTriggered(response)) {
				chatting = false;
				ricky.startChatting(response);
			}
			else {
				ChatbotMain.print("I'm sorry. I don't understand.");
			}
		}
	}
}
