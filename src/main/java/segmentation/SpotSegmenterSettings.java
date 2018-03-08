package segmentation;

import filters.DifferenceOfMeansOrMediansSettings;
import mcib3d.image3d.processing.FastFilters3D;

public class SpotSegmenterSettings
{
    public int minVolume = 0;
    public int maxVolume = Integer.MAX_VALUE;
    public boolean preprocessWithDifferenceOfMeansOrMedians = false;
    public DifferenceOfMeansOrMediansSettings differenceOfMeansOrMediansSettings = null;
    public int seedsThreshold = 1;
    public float localMaximaRadiusXY = 1.0F;
    public float localMaximaRadiusZ = 1.0F;
    public double gaussFitBorderInSigma = 1.0D;
    public int gaussFitMaxRadius = 1;
    public boolean useWatershedForObjectSplitting = false;

}
