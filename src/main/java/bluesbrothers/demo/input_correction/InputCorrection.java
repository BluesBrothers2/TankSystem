package bluesbrothers.demo.input_correction;

public interface InputCorrection<T> {

    default String upperFistLetter(String text) {
        if (!Character.isUpperCase(text.charAt(0))) {
            return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
        } else {
            return text;
        }
    }

    T correctInputBeforeSave(T input);

}
