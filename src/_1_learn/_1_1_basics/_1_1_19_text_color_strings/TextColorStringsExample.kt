package _1_learn._1_1_basics._1_1_19_text_color_strings

/*
# Text Color

## Text Colors

- Black  | "\u001B[30m"
- Red    | "\u001B[31m"
- Green  | "\u001B[32m"
- Yellow | "\u001B[33m"
- Blue   | "\u001B[34m"
- Purple | "\u001B[35m"
- Cyan   | "\u001B[36m"
- White  | "\u001B[37m"

## Text Background Colors

- Black  BACKGROUND | "\u001B[40m"
- Red    BACKGROUND | "\u001B[41m"
- Green  BACKGROUND | "\u001B[42m"
- Yellow BACKGROUND | "\u001B[43m"
- Blue   BACKGROUND | "\u001B[44m"
- Purple BACKGROUND | "\u001B[45m"
- Cyan   BACKGROUND | "\u001B[46m"
- White  BACKGROUND | "\u001B[47m"

- Reset text color and background | "\u001B[0m"
*/

private const val BLACK_TEXT_COLOR = "\u001B[30m"
private const val RED_TEXT_COLOR = "\u001B[31m"
private const val GREEN_TEXT_COLOR = "\u001B[32m"
private const val YELLOW_TEXT_COLOR = "\u001B[33m"
private const val BLUE_TEXT_COLOR = "\u001B[34m"
private const val PURPLE_TEXT_COLOR = "\u001B[35m"
private const val CYAN_TEXT_COLOR = "\u001B[36m"
private const val WHITE_TEXT_COLOR = "\u001B[37m"
private const val BLACK_BACKGROUND_TEXT_COLOR = "\u001B[40m"
private const val RED_BACKGROUND_TEXT_COLOR = "\u001B[41m"
private const val GREEN_BACKGROUND_TEXT_COLOR = "\u001B[42m"
private const val YELLOW_BACKGROUND_TEXT_COLOR = "\u001B[43m"
private const val BLUE_BACKGROUND_TEXT_COLOR = "\u001B[44m"
private const val PURPLE_BACKGROUND_TEXT_COLOR = "\u001B[45m"
private const val CYAN_BACKGROUND_TEXT_COLOR = "\u001B[46m"
private const val WHITE_BACKGROUND_TEXT_COLOR = "\u001B[47m"
private const val NORMAL_TEXT_COLOR_AND_BACKGROUND = "\u001B[0m"

fun main() {
    printTextColors()
    printTextBackgroundColors()
    printTextBackgroundColorsAndColors()
}

private fun printTextBackgroundColorsAndColors() {
    println("# Text Background Colors and Colors")
    System.out.printf("- Normal: %s Salam\n", NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Black : %s %s Salam %s\n", BLACK_TEXT_COLOR, BLACK_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Red   : %s %s Salam %s\n", RED_TEXT_COLOR, RED_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Green : %s %s Salam %s\n", GREEN_TEXT_COLOR, GREEN_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Yellow: %s %s Salam %s\n", YELLOW_TEXT_COLOR, YELLOW_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Blue  : %s %s Salam %s\n", BLUE_TEXT_COLOR, BLUE_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Purple: %s %s Salam %s\n", PURPLE_TEXT_COLOR, PURPLE_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Cyan  : %s %s Salam %s\n", CYAN_TEXT_COLOR, CYAN_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- White : %s %s Salam %s", WHITE_TEXT_COLOR, WHITE_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
}

private fun printTextBackgroundColors() {
    println("# Text Background Colors")
    System.out.printf("- Normal: %s Salam\n", NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Black : %s Salam %s\n", BLACK_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Red   : %s Salam %s\n", RED_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Green : %s Salam %s\n", GREEN_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Yellow: %s Salam %s\n", YELLOW_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Blue  : %s Salam %s\n", BLUE_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Purple: %s Salam %s\n", PURPLE_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Cyan  : %s Salam %s\n", CYAN_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- White : %s Salam %s\n\n", WHITE_BACKGROUND_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
}

private fun printTextColors() {
    println("# Text Colors")
    System.out.printf("- Normal: %s Salam\n", NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Black : %s Salam %s\n", BLACK_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Red   : %s Salam %s\n", RED_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Green : %s Salam %s\n", GREEN_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Yellow: %s Salam %s\n", YELLOW_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Blue  : %s Salam %s\n", BLUE_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Purple: %s Salam %s\n", PURPLE_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- Cyan  : %s Salam %s\n", CYAN_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
    System.out.printf("- White : %s Salam %s\n\n", WHITE_TEXT_COLOR, NORMAL_TEXT_COLOR_AND_BACKGROUND)
}