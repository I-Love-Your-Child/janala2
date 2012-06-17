/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class IF_ICMPLT extends Instruction {
    int label;

    public IF_ICMPLT(int iid, int mid, int label) {
        super(iid, mid);
        this.label = label;
    }

    @Override
    public String toString() {
        return "IF_ICMPLT iid="+iid+" mid="+mid+" label="+label;
    }
}