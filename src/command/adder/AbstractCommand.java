package command.adder;

public abstract class AbstractCommand {

	public abstract int execute(int value);
	public abstract int undo();
}
