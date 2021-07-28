import os, os.path
import win32com.client

# ------------------------------------------------------------------------------------------------

def run_excel_macro(excel_path):
    if os.path.exists(excel_path):

        try:
            print("started...")

            # get excel application object
            excel_app_obj = win32com.client.Dispatch("Excel.Application")

            # open excel
            wb = excel_app_obj.Workbooks.Open(os.path.abspath(excel_path))
            excel_app_obj.Visible = False

            # run macro
            excel_app_obj.Application.Run("Module1.TimeModule")

            # save and close workbook
            wb.Close(SaveChanges=1)

            # quit excel application
            excel_app_obj.Application.Quit() 
            del excel_app_obj
        
        except Exception as e:
            print("exception occurred ")
            print(e)
            excel_app_obj.Application.Quit() 

        else:
            print("finished running macro...")
        
    else:
        print("excel path does not exists @ {}",excel_path )

# ------------------------------------------------------------------------------------------------
if(__name__ == "__main__"):
    run_excel_macro("hello.xlsm")

# ------------------------------------------------------------------------------------------------