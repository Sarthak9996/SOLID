package solid.solid_principles.D;

class Desktop {
	private Monitor monitor;
	private QwertyKeybooard keyboard;

	public Desktop() {
		this.monitor = new Monitor();
		this.keyboard = new QwertyKeybooard();
	}
}

class Monitor {
}

class QwertyKeybooard {
}

/*
 * So the problem is Desktop is tightely couped with the monitor and the
 * keyboard because as and when instance of Desktop will be created the
 * instances of monitor and keyboard will also be created
 */
public class DIssue {

}
