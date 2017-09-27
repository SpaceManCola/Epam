public class StrWork {
    public static void main(String[] args) {
        String str = "Уважаемый, $userName, извещаем вас о том, что на вашем счете $номерсчета скопилась сумма, \n"
                + "превышающая стоимость $числомесяцев месяцев пользования нашими услугами. Деньги продолжают поступать. \n"
                + "Вероятно, вы неправильно настроили автоплатеж. С уважением, $пользовательФИО $должностьпользователя";

        String s = replaseStr(str, "userName", "Timur Vichuzhanin");
        s = replaseStr(s, "номерсчета", "88005553535");
        s = replaseStr(s, "числомесяцев", "3");
        s = replaseStr(s, "пользовательФИО", "Администраторов Администратор Адмнистратович");
        s = replaseStr(s, "должностьпользователя", "админ");
        System.out.println(s);
    }

    public static String replaseStr(String s, String templateKey, String templateValue) {
        s = s.replaceAll("\\$" + templateKey, templateValue);
        return s;
    }
}
