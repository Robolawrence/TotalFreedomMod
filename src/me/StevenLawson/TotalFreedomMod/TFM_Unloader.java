package me.StevenLawson.TotalFreedomMod;

public class TFM_Unloader
{
    public static void unload()
    {
        TFM_AdminWorld.getInstance().unload();
        TFM_CommandBlocker.getInstance().unload();
        TFM_Config.getInstance().unload();
        // TFM_ConfigEntry.unload();
        // TFM_CustomWorld.unload();
        // TFM_DisguiseCraftBridge.unload();
        // TFM_EssentialsBridge.unload();
        TFM_Flatlands.getInstance().unload();
        TFM_GameRuleHandler.unload(); // Static
        // TFM_Heartbeat.unload();
        TFM_Jumppads.getInstance().unload();
        TFM_Log.unload(); // Static
        TFM_LogFile.getInstance().unload();
        TFM_PlayerData.unload(); // Static
        // TFM_PlayerRank.unload();
        TFM_ProtectedArea.unload(); // Static
        TFM_RollbackManager.unload(); // Static
        TFM_ServerInterface.unload(); // Static
        TFM_ServiceChecker.getInstance().unload();
        // TFM_Superadmin.unload();
        TFM_SuperadminList.unload(); // Static
        // TFM_TwitterHandler.getInstance().unload();
        TFM_UserList.getInstance(TotalFreedomMod.plugin).unload();
        TFM_Util.unload(); // Static
        // TFM_WorldEditBridge.getInstance().unload();
    }
}
