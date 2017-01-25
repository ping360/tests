package core.less5;

public class Computer {

	private String Vendor;
	
	private Cpu cpu;
	
	private Ram ram;
	
	private Hdd hdd;

	public Computer(String vendor, Cpu cpu, Ram ram, Hdd hdd) {
		this.Vendor = vendor;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	public Computer(String vendor, double cpuFrequency, int count, int ramFrequency, int ramCapacity, int hddCapacity) {
		this.Vendor = vendor;
		this.cpu = new Cpu(cpuFrequency, count);
		this.ram = new Ram(ramFrequency, ramCapacity);
		this.hdd = new Hdd(hddCapacity);
	}
	
	public void turboBoost() {
		cpu.turboBoost();
	}

	public String getVendor() {
		return Vendor;
	}

	public void setVendor(String vendor) {
		Vendor = vendor;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Hdd getHdd() {
		return hdd;
	}

	public void setHdd(Hdd hdd) {
		this.hdd = hdd;
	}

	@Override
	public String toString() {
		return "Computer [Vendor=" + Vendor + ", cpu=" + cpu + ", ram=" + ram
				+ ", hdd=" + hdd + "]";
	}
	
	
}
