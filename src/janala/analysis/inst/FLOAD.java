/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class FLOAD extends Instruction {
    int var;

    public FLOAD(int iid, int mid, int var) {
        super(iid, mid);
        this.var = var;
    }

    @Override
    public String toString() {
        return "FLOAD iid="+iid+" mid="+mid+" var="+var;
    }
}