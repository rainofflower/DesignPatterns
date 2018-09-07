package command.commandmode;

//������
public class MarcoCommand implements Command {

	private Command[] commands;
		
	public MarcoCommand(Command[] commands) {
		this.commands = commands;
	}

	
	public void execute() {
		// TODO Auto-generated method stub
		for(int i= 0; i<commands.length; i++){
			commands[i].execute();
		}
	}

	
	public void undo() {
		// TODO Auto-generated method stub
		for(int i= 0; i<commands.length; i++){
			commands[i].undo();
		}
	}

}
