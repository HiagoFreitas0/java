
public class GeneMutante implements IGene{

	IGene g1;
	IGene g2;
    private String filtro;
    
	public GeneMutante(IGene g1, IGene g2, String filtro) {
		this.g1 = g1;
		this.g2 = g2;
		this.filtro = filtro;
	}
    
	public String getSequencia() {
        String seq = getg1().getSequencia() + g2.getSequencia();
        for (char c : filtro.toCharArray()) {
            seq = seq.replace(String.valueOf(c), "");
        }
        return seq;
    }

    public int getForca() {
        return (int) getSequencia().chars().distinct().count();
    }

	public IGene getg1() {
		return g1;
	}

	public void setg1(IGene g1) {
		this.g1 = g1;
	}
	
}
