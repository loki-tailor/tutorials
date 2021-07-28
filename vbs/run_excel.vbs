Dim args, excel_obj

Set args = WScript.Arguments
Set excel_obj = CreateObject("Excel.Application")

excel_obj.workbooks.Open args(0)
excel_obj.visible = True
excel_obj.Run "TimeModule"

excel_obj.Activeworkbook.Save
excel_obj.Activeworkbook.Close(0)
excel_obj.Quit