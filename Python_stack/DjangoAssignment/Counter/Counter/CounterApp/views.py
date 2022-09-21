from django.shortcuts import render , redirect 
def counting(request):
    if 'count' in request.session:
        request.session['count'] +=1
    else:
        request.session['count'] = 1 

    return render(request , 'counter.html')


def AddTwo(request):
    request.session['count'] +=1
    return  redirect ('/')
    


def Reset(request):
    request.session['count'] =0
    return  redirect ('/')