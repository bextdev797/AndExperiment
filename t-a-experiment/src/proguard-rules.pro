# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.bextdev.taexperiment.TAExperiment {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/bextdev/taexperiment/repack'
-flattenpackagehierarchy
-dontpreverify
