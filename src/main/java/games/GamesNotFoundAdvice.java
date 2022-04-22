//package games;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ControllerAdvice
//class GamesNotFoundAdvice {
//
//    @ResponseBody
//    @ExceptionHandler(GamesNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    String employeeNotFoundHandler(GamesNotFoundException ex) {
//        return ex.getMessage();
//    }
//
////    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
////    String cnf(GamesConflictException gc){
////        return gc.toString();
////    }
//}