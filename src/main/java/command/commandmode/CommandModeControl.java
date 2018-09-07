package command.commandmode;

import java.util.Stack;

import command.tradition.Control;

public class CommandModeControl implements Control {

	private Command[] onCommands;
	
	private Command[] offCommands;
	
	//��ջ���ݽṹ���Ƚ��ȳ���
	private Stack<Command> stack = new Stack<Command>(); 
	
	public CommandModeControl(){

		onCommands = new Command[5];
		offCommands = new Command[5];
		
		Command noCommand = new NoCommand();
		
		for(int i = 0; i<onCommands.length; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;					
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	
	public void onButton(int slot) {
		// TODO Auto-generated method stub
		onCommands[slot].execute();
		stack.push(onCommands[slot]);
	}

	
	public void offButton(int slot) {
		// TODO Auto-generated method stub
		offCommands[slot].execute();
		stack.push(offCommands[slot]);
	}

	
	public void undoButton() {
		// TODO Auto-generated method stub
		stack.pop().undo();
	}

}
