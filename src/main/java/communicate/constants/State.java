package communicate.constants;

public enum State {

    //默认状态，等待发送命令或者接收消息
    WAITING,

    //等待客户端返回灭菌器id
    GETTING_S_ID,

    //等待开启灭菌返回状态
    STARTING,

    //等待停止灭菌返回状态
    STOPPING,

    //等待设置排气等级0级返回状态
    SETTING_EXHCLA_0,

    //等待设置排气等级1级返回状态
    SETTING_EXHCLA_1,

    //等待设置排气等级2级返回状态
    SETTING_EXHCLA_2,

    //等待设置排气等级3级返回状态
    SETTING_EXHCLA_3,

    //等待设置排气等级4级返回状态
    SETTING_EXHCLA_4,

    //等待设置排气等级5级返回状态
    SETTING_EXHCLA_5,

    //设置海拔高度
    SETTING_ALTITUDE,

    //设置临时密码
    SETTING_TEMP_PASSWORD,

    //等待获取灭菌器的部分参数
    GETTING_PART_PARAMETER,

    //等待获取灭菌器的全部参数
    GETTING_ALL_PARAMETER,

    //等待获取预查询的指令（部分）
    GETTING_PART_QUERY,

    //等待获取预查询的指令（全部）
    GETTING_ALL_QUERY,

    //等待根据欲查询记录次数获取灭菌器的部分参数
    GETTING_PART_PARAMETER_WITHNO,

    //等待根据欲查询记录次数获取灭菌器的全部参数
    GETTING_ALL_PARAMETER_WITHNO,

    //远程诊断获取15个参数 “全部”参数
    DIAGNOSE_QUERY_MORE,

    //远程诊断获取9个参数 “部分”参数
    DIAGNOSE_QUERY_LESS,

    //写欲查询的运行记录次数到灭菌器寄存器中
    WRITINT_RECORD_NUM_TO_REG,

    //查询运行记录时 获取19个参数 0072H-0084H
    WORK_RECORD_QUERY_MORE,

    //查询运行记录时 获取14个参数 0090H-009DH
    WORK_RECORD_QUERY_LESS,

    //获取总共运行次数
    GETING_TOTAL_NUMBER_RUN,

    //写总共运行记录次数到灭菌器寄存器中
    WRITINT_LAST_RECORD_NUM_TO_REG,

    //正在获取开关状态
    GETING_SWITCH_STATE,

    //正在获取未换水天数
    GETING_NOWATER_DAY,

}
