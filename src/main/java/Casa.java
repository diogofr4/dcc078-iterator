import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Casa implements Iterable<Residente> {
    private List<Residente> residenteList = new ArrayList<Residente>();

    public Casa(Residente... residenteList) {
        this.residenteList = Arrays.asList(residenteList);
    }

    @Override
    public Iterator<Residente> iterator() {
        return residenteList.iterator();
    }
}
