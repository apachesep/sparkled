package io.sparkled.music;

import io.sparkled.model.entity.ScheduledSong;

/**
 * Uses {@link ScheduledSong} records to schedule and play songs at appropriate times.
 */
public interface SongSchedulerService {

    /**
     * Start the service and load the next scheduled song.
     */
    void start();

    /**
     * Load the next scheduled song.
     */
    void scheduleNextSong();
}
