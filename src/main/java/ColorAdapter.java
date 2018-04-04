import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorAdapter extends XmlAdapter<String, Color> {
    private final static Pattern REGEX_RGBA = Pattern.compile("rgba\\((\\d+),(\\d+),(\\d+),(\\d+)\\)");

    @Override
    public java.awt.Color unmarshal(String v) throws Exception {
        if (v == null || v.length() == 0) {
            return null;
        }

        final Matcher m = REGEX_RGBA.matcher(v);
        if (m.find() && m.groupCount() == 4) {
            final int r = Integer.valueOf(m.group(1));
            final int g = Integer.valueOf(m.group(2));
            final int b = Integer.valueOf(m.group(3));
            final int a = Integer.valueOf(m.group(4));
            return new java.awt.Color(r, g, b, a);
        }
        return null;
    }

    @Override
    public String marshal(java.awt.Color v) throws Exception {
        if (v == null) {
            return null;
        }
        return "rgba(" + v.getRed() + "," + v.getGreen() + "," + v.getBlue() + "," + v.getAlpha() + ")";
    }
}