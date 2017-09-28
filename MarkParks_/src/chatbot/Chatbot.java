package chatbot;

public class Chatbot {

	private String username;
	private boolean chatting;
	private Topic mark;
	
	public Chatbot() {
		mark = new ChatbotMark();
		username = "Unknown User";
		chatting = true;
	}

	public void startChatting() {
		ChatbotMain.print("Hi, I am an intelligent machine that can respond to your input. Tell me your name.");
		username = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("What would you like to talk about?");
			String response = ChatbotMain.getInput();
			if(mark.isTriggered(response)) {
				chatting = false;//exit
				mark.talk(response);
			}else {
				ChatbotMain.print("I'm sorry, I don't understand");
			}
		}
	}

}
