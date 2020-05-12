package Inleveropracht1;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReizigerDAOImpl implements ReizigerDao{
    private ArrayList<Reiziger> alleReizigers = new ArrayList<Reiziger>();

    public List<Reiziger> findAll() {
        return alleReizigers;
    }

    public List<Reiziger> findByGBdatum(String GBdatum) throws ParseException{
        List<Reiziger> gevondenReizigers = new ArrayList<Reiziger>();
        for (Reiziger r : alleReizigers) {
            Date date = r.getGbdatum();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String text = df.format(date);

            if (text.equals(GBdatum)) {
                gevondenReizigers.add(r);
            }
        }
        return gevondenReizigers;
    }

    public Reiziger save(Reiziger reiziger) {
        alleReizigers.add(reiziger);
        return reiziger;
    }

    public Reiziger update(Reiziger reiziger) {
        int index = 0;
        for (Reiziger r : alleReizigers) {
            if (r.getReizigerID() == reiziger.getReizigerID()) {
                alleReizigers.set(index, reiziger);
                break;
            } else {
                index++;
            }
        }
        return reiziger;
    }

    public boolean delete(Reiziger reiziger) {
        int index = 0;
        for (Reiziger r : alleReizigers) {
            if (r.getReizigerID() == reiziger.getReizigerID()) {
                alleReizigers.remove(index);
                return true;
            } else {
                index++;
            }
        }
        return false;

    }

}
