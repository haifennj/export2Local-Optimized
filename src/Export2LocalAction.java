import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.ApplicationManager;

/**
 * @author summer
 */
public class Export2LocalAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        ApplicationManager.getApplication().invokeLater(() -> {
            Export2LocalDialog dialog = new Export2LocalDialog(e);
            dialog.setSize(720, 415);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            dialog.requestFocus();
        });
    }
}
