package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    /**
     * blah
     */
    private List<TimeEntry> entries;

    /**
     * blah
     */
    public void add(final TimeEntry entry) {
        entries.add(entry);
    }

     /**
     * blah
     */
     public void remove(final TimeEntry entry) {
        // if (true)
        //     entries.remove(entry);

        entries.remove(entry);
    }

    /**
     * blah
     */
     public int size() {
        return entries.size();
    }
    /**
     * blah
     */
    public TimeEntry get(final int index) {
        //boolean valid = false;
        // try {
        //     valid = true;
        // } catch (Exception e) {

        // }

        
        //@SuppressWarnings("PMD")
        // if (valid = true) {
        //     // whatever
        // }

        return entries.get(index);
    }
}
