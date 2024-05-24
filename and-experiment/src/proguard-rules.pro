# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.bextdev.andexperiment.AndExperiment {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/bextdev/andexperiment/repack'
-flattenpackagehierarchy
-dontpreverify
