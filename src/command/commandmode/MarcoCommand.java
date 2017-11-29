package command.commandmode;

//∫Í√¸¡Ó
public class MarcoCommand implements Command {

	private Command[] commands;
		
	public MarcoCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(int i= 0; i<commands.length; i++){
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(int i= 0; i<commands.length; i++){
			commands[i].undo();
		}
	}

}
