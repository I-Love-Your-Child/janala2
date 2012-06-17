/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class IFGT extends Instruction {
    int label;

    public IFGT(int iid, int mid, int label) {
        super(iid, mid);
        this.label = label;
    }

    @Override
    public String toString() {
        return "IFGT iid="+iid+" mid="+mid+" label="+label;
    }
}