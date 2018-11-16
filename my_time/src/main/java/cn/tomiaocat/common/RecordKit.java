package cn.tomiaocat.common;



import com.eq.string.StringUtil;
import com.jfinal.plugin.activerecord.Record;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Record 工具类
 * @author: huangzq
 * @date: 2017/12/20 10:38
 */
public class RecordKit {
    /**
     * Record 转 map
     * @author: huangzq
     * @date: 2017/12/20 10:33
     */
    public static List<Map<String,Object>> toMap(List<Record> list){
        if(StringUtil.notNull(list)) {
            List<Map<String, Object>> maps = new ArrayList<>();
            for (Record r: list){
                maps.add(r.getColumns());
            }
            return maps;
        }
        return null;
    }
}
