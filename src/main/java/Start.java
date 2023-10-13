import it.Team3.cpu.Cpu;
import it.Team3.cpu.CpuList;
import it.Team3.exception.MyException;
import it.Team3.pc.PC;

public class Start {
    public static void main(String[] args) throws MyException {
        
        Cpu i511600K = new Cpu("CPU", 0, "Intel", "Core i5-11600K",
                6, "3.9 GHz", "4.9 GHz", 125,
                "Core i5", "LGA 1200", "No", "64 GB");
//        System.out.println(i511600K);
        
        PC pc = new PC();
        CpuList cpuList = new CpuList();
        
        pc.addCpu(cpuList.getI511600K());
//        pc.addCpuCooler();
        System.out.println(pc);
    }
}
