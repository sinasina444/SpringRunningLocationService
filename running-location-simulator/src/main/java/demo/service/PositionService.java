package demo.service;

import demo.model.CurrentPosition;

public interface PositionService {
    void processPositionInfo(long id,
                             CurrentPosition currentPosition,
                             boolean sendPositionsToDistributionService);
}
