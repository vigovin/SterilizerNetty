/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package entity;

import java.util.Date;

/**
 * 灭菌器Entity
 * @author lsm
 * @version 2019-09-05
 */
public class Sterilizer {

    private static final long serialVersionUID = 1L;
    private String sterilizerId;		// 灭菌器编号
    private String name;		// 灭菌器名称
    private String model;		// 灭菌器型号
    private Double version;		// 灭菌器软件版本
    private Integer altitude;		// 海拔高度
    private String account;		// 当前使用账号
    private String modeNumber;		// 当前程序模式号
    private String programCategory;		// 当前程序类别
    private Double sterilizationTemperature;		// 当前程序灭菌温度
    private Integer sterilizationTime;		// 当前程序灭菌时间
    private Double insulationTemperature;		// 当前程序保温温度
    private Integer insulationTime;		// 当前程序保温时间
    private Integer fanSwitch;		// 当前程序风扇开关（0：关闭；1：打开）
    private Integer exhaustClass;		// 当前程序排汽等级
    private Integer dryingSwitch;		// 当前程序智能干燥开关（0：关闭；1：打开）
    private Double dryingTemperature;		// 当前程序干燥温度
    private Integer dryingTime;		// 当前程序干燥时间
    private Integer exhaustAirTime;		// 当前程序排冷空气时间
    private Double openingTemperature;		// 当前程序开盖温度
    private Integer transPressureFluctuationNumber;		// 当前程序跨压脉动次数
    private Integer pPressureFluctuationNumber;		// 当前程序正压脉动次数
    private Integer totalNumberRun;		// 总共运行次数
    private String processStatus;		// 当前仪器所处流程状态
    private Date workDate;		// 运行记录时间
    private Double cavityTemperature;		// 腔温
    private Double itemTemperature;		// 物品温度
    private Double evaporatorTemperature;		// 蒸发器温度
    private Double filterTemperature;		// 滤芯温度
    private Double dryTemperature;		// 干燥温度
    private Double waterTankTemperature;		// 水箱温度
    private Double intracavityPressure;		// 腔内压力
    private Double interlayerPressure;		// 夹层压力
    private String switchStateOne;		// 开关状态1
    private String switchStateTwo;		// 开关状态2
    private Integer nowaterChangeDay;		// 仪器未换水连续天数
    private Integer nowaterChangeSevenDayTime;		// 仪器超过7天未换水次数
//    private Office office;		// 所属机构
//    private Area area;		// 所属地区
    private String status;		// 灭菌器状态
    private String ip;      //灭菌器ip地址
    private Integer port;       //灭菌器端口号
    private String runResult;   //运行结果 数据库中无该字段 只用于同步tWorkRecord
    private Integer recordNO;		//运行记录次数 数据库中无该字段 只用于同步tWorkRecord

    public Sterilizer() {
        super();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSterilizerId() {
        return sterilizerId;
    }

    public void setSterilizerId(String sterilizerId) {
        this.sterilizerId = sterilizerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getModeNumber() {
        return modeNumber;
    }

    public void setModeNumber(String modeNumber) {
        this.modeNumber = modeNumber;
    }

    public String getProgramCategory() {
        return programCategory;
    }

    public void setProgramCategory(String programCategory) {
        this.programCategory = programCategory;
    }

    public Double getSterilizationTemperature() {
        return sterilizationTemperature;
    }

    public void setSterilizationTemperature(Double sterilizationTemperature) {
        this.sterilizationTemperature = sterilizationTemperature;
    }

    public Integer getSterilizationTime() {
        return sterilizationTime;
    }

    public void setSterilizationTime(Integer sterilizationTime) {
        this.sterilizationTime = sterilizationTime;
    }

    public Double getInsulationTemperature() {
        return insulationTemperature;
    }

    public void setInsulationTemperature(Double insulationTemperature) {
        this.insulationTemperature = insulationTemperature;
    }

    public Integer getInsulationTime() {
        return insulationTime;
    }

    public void setInsulationTime(Integer insulationTime) {
        this.insulationTime = insulationTime;
    }

    public Integer getFanSwitch() {
        return fanSwitch;
    }

    public void setFanSwitch(Integer fanSwitch) {
        this.fanSwitch = fanSwitch;
    }

    public Integer getExhaustClass() {
        return exhaustClass;
    }

    public void setExhaustClass(Integer exhaustClass) {
        this.exhaustClass = exhaustClass;
    }

    public Integer getDryingSwitch() {
        return dryingSwitch;
    }

    public void setDryingSwitch(Integer dryingSwitch) {
        this.dryingSwitch = dryingSwitch;
    }

    public Double getDryingTemperature() {
        return dryingTemperature;
    }

    public void setDryingTemperature(Double dryingTemperature) {
        this.dryingTemperature = dryingTemperature;
    }

    public Integer getDryingTime() {
        return dryingTime;
    }

    public void setDryingTime(Integer dryingTime) {
        this.dryingTime = dryingTime;
    }

    public Integer getExhaustAirTime() {
        return exhaustAirTime;
    }

    public void setExhaustAirTime(Integer exhaustAirTime) {
        this.exhaustAirTime = exhaustAirTime;
    }

    public Double getOpeningTemperature() {
        return openingTemperature;
    }

    public void setOpeningTemperature(Double openingTemperature) {
        this.openingTemperature = openingTemperature;
    }

    public Integer getTransPressureFluctuationNumber() {
        return transPressureFluctuationNumber;
    }

    public void setTransPressureFluctuationNumber(Integer transPressureFluctuationNumber) {
        this.transPressureFluctuationNumber = transPressureFluctuationNumber;
    }

    public Integer getpPressureFluctuationNumber() {
        return pPressureFluctuationNumber;
    }

    public void setpPressureFluctuationNumber(Integer pPressureFluctuationNumber) {
        this.pPressureFluctuationNumber = pPressureFluctuationNumber;
    }

    public Integer getTotalNumberRun() {
        return totalNumberRun;
    }

    public void setTotalNumberRun(Integer totalNumberRun) {
        this.totalNumberRun = totalNumberRun;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Double getCavityTemperature() {
        return cavityTemperature;
    }

    public void setCavityTemperature(Double cavityTemperature) {
        this.cavityTemperature = cavityTemperature;
    }

    public Double getItemTemperature() {
        return itemTemperature;
    }

    public void setItemTemperature(Double itemTemperature) {
        this.itemTemperature = itemTemperature;
    }

    public Double getEvaporatorTemperature() {
        return evaporatorTemperature;
    }

    public void setEvaporatorTemperature(Double evaporatorTemperature) {
        this.evaporatorTemperature = evaporatorTemperature;
    }

    public Double getFilterTemperature() {
        return filterTemperature;
    }

    public void setFilterTemperature(Double filterTemperature) {
        this.filterTemperature = filterTemperature;
    }

    public Double getDryTemperature() {
        return dryTemperature;
    }

    public void setDryTemperature(Double dryTemperature) {
        this.dryTemperature = dryTemperature;
    }

    public Double getWaterTankTemperature() {
        return waterTankTemperature;
    }

    public void setWaterTankTemperature(Double waterTankTemperature) {
        this.waterTankTemperature = waterTankTemperature;
    }

    public Double getIntracavityPressure() {
        return intracavityPressure;
    }

    public void setIntracavityPressure(Double intracavityPressure) {
        this.intracavityPressure = intracavityPressure;
    }

    public Double getInterlayerPressure() {
        return interlayerPressure;
    }

    public void setInterlayerPressure(Double interlayerPressure) {
        this.interlayerPressure = interlayerPressure;
    }

    public String getSwitchStateOne() {
        return switchStateOne;
    }

    public void setSwitchStateOne(String switchStateOne) {
        this.switchStateOne = switchStateOne;
    }

    public String getSwitchStateTwo() {
        return switchStateTwo;
    }

    public void setSwitchStateTwo(String switchStateTwo) {
        this.switchStateTwo = switchStateTwo;
    }

    public Integer getNowaterChangeDay() {
        return nowaterChangeDay;
    }

    public void setNowaterChangeDay(Integer nowaterChangeDay) {
        this.nowaterChangeDay = nowaterChangeDay;
    }

    public Integer getNowaterChangeSevenDayTime() {
        return nowaterChangeSevenDayTime;
    }

    public void setNowaterChangeSevenDayTime(Integer nowaterChangeSevenDayTime) {
        this.nowaterChangeSevenDayTime = nowaterChangeSevenDayTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getRunResult() {
        return runResult;
    }

    public void setRunResult(String runResult) {
        this.runResult = runResult;
    }

    public Integer getRecordNO() {
        return recordNO;
    }

    public void setRecordNO(Integer recordNO) {
        this.recordNO = recordNO;
    }
}