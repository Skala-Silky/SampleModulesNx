# Sample project Nx plugin

I made a simple android project with elements of kmp modules.

Here is the connection pattern as it should be (dependencies):
<p style="text-align: center;"><img src="./images/actual.png" width="600" alt="Should be"></p>

Here is the connection pattern that connects nx
<p style="text-align: center;"><img src="./images/graph_22.0.2.png" width="600" alt="Nx generate in 22.0.2"></p>

## Problems
1. First problem is subModuleKmp is not visible, probably don't support plugin
`com.android.kotlin.multiplatform.library`
2. Module dependencies subModuleAndroid\subModuleKmp should be only for moduleAndroid instead of also to app/app2.
3. App & App2 should be visible as an Application (we can recognize it by the `com.android.application`), ModulesNx is a just project name - it is not a application.
4. Maybe this is a wishlist, it would be great if the plugin could recognize the target of a given module (whether it is an Android, JVM, iOS or JS module) - with many modules it is easier to check the module migration process. 