class CPU{
double price;
class Processor{
double cores;
String manufacturer;
double getCache(){
return 4.3;
}
}
protected class RAM{
double memory;
String manufacturer;
double getClockSpeed(){
return 5.5;
}
}
}
public class CPUDetails{
public static void main(String [] args){
CPU cpu = new CPU();
CPU.Processor processor=cpu.new Processor();
CPU.RAM ram=cpu.new RAM();
System.out.println("Processor_cache_=_" + processor.getCache());
System.out.println("ram_clock_speed_=_" + ram.getClockSpeed());
}
}
