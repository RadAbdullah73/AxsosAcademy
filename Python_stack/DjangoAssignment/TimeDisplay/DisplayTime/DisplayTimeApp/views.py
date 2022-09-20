from django.shortcuts import render
from time import gmtime, strftime
    
def index(request):
    context = {
        "time": strftime("%Y-%m-%d", gmtime()),
        "time1": strftime("%H:%M %p", gmtime())
    }
    return render(request,'index.html', context)


