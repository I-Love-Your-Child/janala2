/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class IFLT extends Instruction {
    int label;

    public IFLT(int iid, int mid, int label) {
        super(iid, mid);
        this.label = label;
    }

    @Override
    public String toString() {
        return "IFLT iid="+iid+" mid="+mid+" label="+label;
    }
}