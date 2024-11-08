package name.remal.gradle_plugins.build_time_constants.api;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

public abstract class BuildTimeConstants {

    /**
     * Invocation of this method will be replaced with actual class name.
     *
     * <p><b>Class parameter must be a constant expression.</b>
     */
    @NotNull
    public static String getClassName(@NotNull Class<?> clazz) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual class simple name.
     *
     * <p><b>Class parameter must be a constant expression.</b>
     */
    @NotNull
    public static String getClassSimpleName(@NotNull Class<?> clazz) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual class simple name.
     *
     * <p><b>Class parameter must be a constant expression.</b>
     */
    @NotNull
    public static String getClassPackageName(@NotNull Class<?> clazz) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual class internal name.
     *
     * <p><b>Class parameter must be a constant expression.</b>
     */
    @NotNull
    public static String getClassInternalName(@NotNull Class<?> clazz) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual class descriptor.
     *
     * <p><b>Class parameter must be a constant expression.</b>
     */
    @NotNull
    public static String getClassDescriptor(@NotNull Class<?> clazz) {
        throw newIllegalMethodUseException();
    }


    /**
     * Invocation of this method will be replaced with actual property value.
     *
     * <p><b>Property name parameter must be a constant expression.</b>
     */
    @NotNull
    public static String getStringProperty(@NotNull String propertyName) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual property value parsed as int.
     *
     * <p><b>Property name parameter must be a constant expression.</b>
     */
    public static int getIntegerProperty(@NotNull String propertyName) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual property value parsed as long.
     *
     * <p><b>Property name parameter must be a constant expression.</b>
     */
    public static long getLongProperty(@NotNull String propertyName) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual property value parsed as boolean.
     *
     * <p><b>Property name parameter must be a constant expression.</b>
     */
    public static boolean getBooleanProperty(@NotNull String propertyName) {
        throw newIllegalMethodUseException();
    }


    /**
     * Invocation of this method will be replaced with actual properties values.
     *
     * <p>Property name pattern can contain <code>*</code> char, which is treated as any number of any characters.
     * So, <code>prefix.*</code> matches <code>prefix.</code>, <code>prefix.name</code>,
     * and <code>prefix.name.sub-name</code>.
     *
     * <p><b>Property name pattern parameter must be a constant expression.</b>
     */
    @NotNull
    public static Map<@NotNull String, @NotNull String> getStringProperties(@NotNull String propertyNamePattern) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual properties values parsed as int.
     *
     * <p>Property name pattern can contain <code>*</code> char, which is treated as any number of any characters.
     * So, <code>prefix.*</code> matches <code>prefix.</code>, <code>prefix.name</code>,
     * and <code>prefix.name.sub-name</code>.
     *
     * <p><b>Property name pattern parameter must be a constant expression.</b>
     */
    @NotNull
    public static Map<@NotNull String, @NotNull Integer> getIntegerProperties(@NotNull String propertyNamePattern) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual properties values parsed as long.
     *
     * <p>Property name pattern can contain <code>*</code> char, which is treated as any number of any characters.
     * So, <code>prefix.*</code> matches <code>prefix.</code>, <code>prefix.name</code>,
     * and <code>prefix.name.sub-name</code>.
     *
     * <p><b>Property name pattern parameter must be a constant expression.</b>
     */
    @NotNull
    public static Map<@NotNull String, @NotNull Long> getLongProperties(@NotNull String propertyNamePattern) {
        throw newIllegalMethodUseException();
    }

    /**
     * Invocation of this method will be replaced with actual properties values parsed as boolean.
     *
     * <p>Property name pattern can contain <code>*</code> char, which is treated as any number of any characters.
     * So, <code>prefix.*</code> matches <code>prefix.</code>, <code>prefix.name</code>,
     * and <code>prefix.name.sub-name</code>.
     *
     * <p><b>Property name pattern parameter must be a constant expression.</b>
     */
    @NotNull
    public static Map<@NotNull String, @NotNull Boolean> getBooleanProperties(@NotNull String propertyNamePattern) {
        throw newIllegalMethodUseException();
    }


    private static Error newIllegalMethodUseException() {
        throw new Error("This method can't be invoked directly."
            + " Use `name.remal.build-time-constants.jvm` Gradle plugin to process the method invocation.");
    }


    private BuildTimeConstants() {
        throwIllegalClassUseException();
    }

    private static void throwIllegalClassUseException() {
        throw new Error("This class can't be used directly."
            + " Use `name.remal.build-time-constants.jvm` Gradle plugin to handle the class's methods.");
    }

}