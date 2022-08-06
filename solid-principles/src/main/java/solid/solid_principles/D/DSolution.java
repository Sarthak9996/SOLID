package solid.solid_principles.D;

class Desktopp {
	private Monitorr monitor;
	private Keyboard keyboard;

	public Desktopp(Keyboard keyboard, Monitorr monitor) {
		this.monitor = monitor;
		this.keyboard = keyboard;
	}
}

/*
 * also the desktop could have different types of keyboards so passing of the
 * keyboard interface keeps a check on the rule that abstraction should not
 * depend on details
 */
interface Keyboard {
}

/*
 * so the tightly coupling of desktop on monitor and keyboard has now been
 * removed and the required or desired instance of monitor and keyboard will be
 * sent by the user when the instance of desktop will be created.
 */
/* this is also known as dependency injection */
class Monitorr {
}

class QwertyKeybooardd {
}

public class DSolution {

}
